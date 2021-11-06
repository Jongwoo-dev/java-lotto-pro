package lotto.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoNumbers {
	public static final int LOTTO_NUMBER_COUNT = 6;

	private final List<LottoNumber> numbers;

	public LottoNumbers(int...arrayIntNumbers) {
		this(convertIntegerArrayToLottoNumberList(arrayIntNumbers));
	}
	public LottoNumbers(List<LottoNumber> numbers) {
		validateNumbers(numbers);
		List<LottoNumber> sorted = new ArrayList<>(numbers);
		Collections.sort(sorted);
		this.numbers = sorted;
	}

	public static List<LottoNumber> convertIntegerArrayToLottoNumberList(int[] intNumbers) {
		return Arrays.stream(intNumbers).mapToObj(LottoNumber::new).collect(Collectors.toList());
	}

	/**
	 * 로또 번호 유효성 체크
	 * @param numbers 로또 번호 목록
	 */
	private void validateNumbers(List<LottoNumber> numbers) {
		if (numbers == null || numbers.size() != LOTTO_NUMBER_COUNT) {
			throw new IllegalArgumentException("로또 번호가 없거나 크기가 다릅니다 : "+numbers);
		}
		Set<LottoNumber> duplicationCheck = new HashSet<>(numbers);
		if (duplicationCheck.size() != LOTTO_NUMBER_COUNT) {
			throw new IllegalArgumentException("중복된 로또 번호가 존재합니다. : "+numbers);
		}

	}

	@Override
	public String toString() {
		return numbers.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LottoNumbers numbers1 = (LottoNumbers)o;
		return Objects.equals(numbers, numbers1.numbers);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numbers);
	}
}
