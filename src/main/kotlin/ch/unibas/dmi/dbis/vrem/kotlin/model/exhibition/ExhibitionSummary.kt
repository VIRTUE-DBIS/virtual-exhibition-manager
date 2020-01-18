package ch.unibas.dmi.dbis.vrem.kotlin.model.exhibition

import org.bson.types.ObjectId

/**
 * Tuple of objectId and name of an exhibition.
 * @author loris.sauter
 */
data class ExhibitionSummary(val objectId: String, val name: String) {
    constructor(id: ObjectId, name: String) : this(id.toHexString(), name)
}