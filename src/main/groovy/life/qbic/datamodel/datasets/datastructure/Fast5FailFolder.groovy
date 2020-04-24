package life.qbic.datamodel.datasets.datastructure

/**
 * A special case of a DataFolder, its name is always fast5_fail.
 *
 * Its children field contains either a list of type List<Fast5Files> or List<Fast5Folder>
 *
 * @author: Sven Fillinger
 */
class Fast5FailFolder extends DataFolder {

    final private static String NAME = "fast5_fail"

    protected Fast5FailFolder() {}

    protected Fast5FailFolder(String path, List<?> children ) {
        super(NAME, path, children)
    }

}
