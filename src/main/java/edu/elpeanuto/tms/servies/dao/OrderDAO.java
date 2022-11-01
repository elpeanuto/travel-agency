package edu.elpeanuto.tms.servies.dao;

import edu.elpeanuto.tms.model.Order;
import edu.elpeanuto.tms.servies.exception.DAOException;

import java.util.List;
import java.util.Optional;

/**
 * The interface that is needed to expand the BaseDAO if necessary
 * @see edu.elpeanuto.tms.servies.dao.BaseDAO
 */
public interface OrderDAO extends BaseDAO<Long, Order> {
    boolean changeStatus(Long id, String status) throws DAOException;

    Optional<Integer> numOfRegisteredOrders(Long userId) throws DAOException;

    Optional<Integer> getNumberOfNotesByUserId(Long userId) throws DAOException;

    List<Order> getPaginationByUserId(Integer start, Integer numOfStrings, Long userId) throws DAOException;

    List<Order> getPaginationNotProceeded(Integer start, Integer numOfStrings) throws DAOException;

    Optional<Integer> getNumberOfNotesNotProceeded() throws DAOException;
}
