package com.cajamenor.models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CajaMenorLoombokData {
    private String motivo;
    private String valor;
    public String getMotivo() {
        return motivo;
    }
    public String getValor() {
        return valor;
    }

    public static List<CajaMenorLoombokData> setData(DataTable dataTable) {
        List<CajaMenorLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, CajaMenorLoombokData.class));
        }
        return dates;
    }
}
