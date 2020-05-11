package lotto.utils;

import lotto.model.Lotto;
import lotto.interfaces.LottoCreateStrategy;

import java.util.ArrayList;
import java.util.List;

public class AutoCreateStrategy implements LottoCreateStrategy {
    @Override
    public List<Lotto> create(int countOfAutoLotto) {
        List<Lotto> autoLotto = new ArrayList<>();
        for (int i = 0; i < countOfAutoLotto; i++) {
            RandomLottoCreator randomLottoCreator = new RandomLottoCreator();
            Lotto lotto = new Lotto(randomLottoCreator.createRandomNumbers());
            autoLotto.add(lotto);
        }
        return autoLotto;
    }
}
