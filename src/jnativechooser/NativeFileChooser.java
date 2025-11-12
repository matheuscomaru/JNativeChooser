package jnativechooser;

import java.awt.Component;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FilenameFilter;
import java.util.Arrays;

public class NativeFileChooser {
    public static String showDialog(Component parent, String[] extensoes) {
        FileDialog dialog = new FileDialog((Frame) null, "Selecione um arquivo", FileDialog.LOAD);
        if (extensoes != null && extensoes.length > 0) {
            dialog.setFilenameFilter(new FilenameFilter() {
                @Override
                public boolean accept(java.io.File dir, String name) {
                    return Arrays.stream(extensoes).anyMatch(ext -> name.toLowerCase().endsWith("." + ext.toLowerCase()));
                }
            });
        }
        dialog.setVisible(true);
        if (dialog.getFile() != null) {
            return dialog.getDirectory() + dialog.getFile();
        }
        return null;
    }

    // Mantém compatibilidade com a versão antiga
    public static String showDialog(Component parent) {
        return showDialog(parent, new String[] {"*"}); // Aceita todos por padrão
    }
}
