package interfaces;

import model.Comprobante;

import java.util.List;

public class TangoErpInterface implements IErpInterface{
    private Tango tango;

    public TangoErpInterface() {
        tango = new Tango();
    }

    @Override
    public List<Comprobante> getFacturas() {
        return null;
    }
}
