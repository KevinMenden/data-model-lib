package life.qbic.datamodel.datasets.datastructure.files.nanopore

import life.qbic.datamodel.datasets.datastructure.files.DataFile

/**
 * A specialisation of a DataFile, represents an Oxford Nanopore duty time log file
 *
 * @author: Sven Fillinger
 */
class DutyTimeLog extends DataFile {

    final private static String FILE_TYPE = "csv"

    final private static String NAME_SCHEMA = $/duty_time_.*/$

    protected DutyTimeLog() {}

    protected DutyTimeLog(String name, String relativePath) {
        super(name, relativePath, FILE_TYPE)
        validateName()
    }

    static DutyTimeLog create(String name, String relativePath) {
        return new DutyTimeLog(name, relativePath)
    }

    private void validateName() {
        if (!(this.name =~ NAME_SCHEMA)) {
            throw new IllegalArgumentException("Name must match the Nanopore drift correction schema!")
        }
    }
}
