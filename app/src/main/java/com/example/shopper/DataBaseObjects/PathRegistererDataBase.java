package com.example.shopper.DataBaseObjects;

import com.example.shopper.NavigationElements.Path;

public class PathRegistererDataBase {
    private Path single_path;

    public PathRegistererDataBase() {
    }

    public void setSingle_path(Path path_other) {
        this.single_path = new Path(path_other);
    }

    public Path getSingle_path() {
        return single_path;
    }
}
