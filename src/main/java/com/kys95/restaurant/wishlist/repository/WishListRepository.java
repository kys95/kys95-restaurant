package com.kys95.restaurant.wishlist.repository;

import com.kys95.restaurant.db.MemoryDbRepositoryAbstract;
import com.kys95.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
