package ch.unibas.dmi.dbis.vrem.kotlin.model.api.response

import ch.unibas.dmi.dbis.vrem.kotlin.model.exhibition.Exhibit
import kotlinx.serialization.Serializable

/**
 * Response to list exhibits action.
 *
 * Wrapper for a list of exhibits.
 *
 * @author loris.sauter
 */
@Serializable
data class ListExhibitsResponse (val exhibits:List<Exhibit>)