package org.apache.flink.connector.file.src;

import org.apache.flink.api.connector.source.SourceSplit;
import org.apache.flink.connector.file.src.util.CheckpointedPosition;

import java.util.Optional;

/**
 * Gets the (checkpointed) position of the reader, if set. This value is typically absent for splits
 * when assigned from the enumerator to the readers, and present when the splits are recovered from
 * a checkpoint.
 */
public interface CheckpointableSourceSplit extends SourceSplit {

    Optional<CheckpointedPosition> getReaderPosition();
}
