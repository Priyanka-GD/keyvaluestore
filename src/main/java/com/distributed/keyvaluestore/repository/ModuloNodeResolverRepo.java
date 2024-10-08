package com.distributed.keyvaluestore.repository;

import com.distributed.keyvaluestore.CommonVariables;
import org.springframework.stereotype.Repository;

@Repository
public class ModuloNodeResolverRepo implements NodeResolverRepo {
    @Override
    public int getNodeIndex (String userId) {
        int hashCode = Math.abs(userId.hashCode());
        return hashCode % CommonVariables.COUNT_OF_NODES;
    }
}
