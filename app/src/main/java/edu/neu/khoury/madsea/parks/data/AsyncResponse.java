package edu.neu.khoury.madsea.parks.data;

import java.util.List;

import edu.neu.khoury.madsea.parks.model.Park;

public interface AsyncResponse {
    void processPark(List<Park>parks);
}
