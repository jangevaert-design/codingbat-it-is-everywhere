package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatItIsEverywhereTest {

  private int[][] everywhereArrayParams = {
      {1, 2, 1, 3},
      {1, 2, 1, 3},
      {1, 2, 1, 3, 4},
      {2, 1, 2, 1},
      {2, 1, 2, 1},
      {2, 1, 2, 3, 1},
      {3, 1},
      {3, 1},
      {3},
      {},
      {1, 2, 1, 2, 3, 2, 5},
      {1, 2, 1, 1, 1, 2},
      {2, 1, 2, 1, 1, 2},
      {2, 1, 2, 2, 2, 1, 1, 2},
      {2, 1, 2, 2, 2, 1, 2, 1},
      {2, 1, 2, 1, 2}
  };

  private int[] everywhereIntParams = {1, 2, 1, 1, 2, 2, 3, 2, 1, 1, 2, 2, 2, 2, 2, 2};

  private boolean[] everywhereExpected = {true, false, false, true, true, false, true, false, true,
  true, true, false, false, false, true, true};

  @Test
  void everywhereTest() {
    for (int i = 0; i < everywhereArrayParams.length; i++) {
      boolean actual = CodingBatItIsEverywhere.isEverywhere(everywhereArrayParams[i], everywhereIntParams[i]);
      Assertions.assertEquals(actual, everywhereExpected[i]);
    }
  }

}