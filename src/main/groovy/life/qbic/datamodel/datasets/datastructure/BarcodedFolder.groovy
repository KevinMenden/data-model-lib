package life.qbic.datamodel.datasets.datastructure

import life.qbic.datamodel.identifiers.SampleCodeFunctions
import life.qbic.datamodel.samples.Sample

/**
 * Specialisation version of a Folder object.
 * 
 * The folder name must contain the QBiC barcode.
 *
 * @author: Sven Fillinger
 */
class BarcodedFolder extends DataFolder {

    protected BarcodedFolder() {}

    protected BarcodedFolder(String name, String path, List children) {
        super(name, path, children)
        validateName()
    }

    static BarcodedFolder create(String name, String path, List children) {
        new BarcodedFolder(name, path, children)
    }

    private void validateName() {
        if (!(this.name =~ SampleCodeFunctions.QBIC_SAMPLE_ID_SCHEMA)) {
            throw new IllegalArgumentException("Name must match the QBiC barcode regex!")
        }
    }
}
