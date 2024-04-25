package jmemorize.core;

import jmemorize.core.Category.EventsType;

/**
 * Interface for observers of a category. Categories can signal either card or
 * category hierarchy related events. Observing a specific category will
 * automatically listen to all of its child categories too.
 *
 * @author djemili
 */
public interface CategoryObserver
{
    /**
     * Gets notified when a card event happens in the observed category or in
     * one of its child categories.
     *
     * @param type Either EDITED_EVENT, ADDED_EVENT, REMOVED_EVENT,
     * EXPIRED_EVENT or DECK_EVENT.
     * @param card The card that changed.
     * @param category The category to which the changed card belongs.
     * @param deck The deck that held the card when the event happened.
     */
    void onCardEvent(int type, Card card, Category category, int deck);

    /**
     * Gets notified when a category event happens in the observed category or
     * in one of its child categories.
     *
     * @param type Either EDITED_EVENT, ADDED_EVENT or REMOVED_EVENT.
     * @param category The category that created the event.
     */
    void onCategoryEvent(int type, Category category);
}
