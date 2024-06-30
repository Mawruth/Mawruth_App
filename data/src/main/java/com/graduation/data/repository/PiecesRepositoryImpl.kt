package com.graduation.data.repository

import com.graduation.data.dataSourceContract.pieces.PiecesDataStore
import com.graduation.domain.model.pieces.PiecesItem
import com.graduation.domain.model.pieces.PiecesResponse
import com.graduation.domain.repositories.PiecesRepository
import javax.inject.Inject

class PiecesRepositoryImpl
@Inject constructor(private val piecesDataStore: PiecesDataStore) : PiecesRepository {
    override suspend fun getPieceById(pieceId: Int): PiecesItem? {
        return piecesDataStore.getPieceById(pieceId)
    }

    override suspend fun getAllMuseumPieces(
        museumId: Int,
        page: Int,
        limit: Int,
        name: String?
    ): PiecesResponse? {
        return piecesDataStore.getMuseumPieces(museumId, page, limit, name)
    }

    override suspend fun getPiecesOfCollection(collectionID: Int, museumID: Int): PiecesResponse? {
        return piecesDataStore.getPiecesOfCollection(
            collectionID = collectionID,
            museumID = museumID
        )
    }

}