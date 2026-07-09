<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RelatedEntity extends Model
{
    // 所关联实体的类型
    /**
     * @example COSTOMER_ENETITY
     *
     * @var string
     */
    public $entityType;

    // 所关联实体的trustiot唯一ID
    /**
     * @example 7006071575276187649
     *
     * @var int
     */
    public $relatedEntityTrustiotId;
    protected $_name = [
        'entityType'              => 'entity_type',
        'relatedEntityTrustiotId' => 'related_entity_trustiot_id',
    ];

    public function validate()
    {
        Model::validateRequired('entityType', $this->entityType, true);
        Model::validateRequired('relatedEntityTrustiotId', $this->relatedEntityTrustiotId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->relatedEntityTrustiotId) {
            $res['related_entity_trustiot_id'] = $this->relatedEntityTrustiotId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RelatedEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['related_entity_trustiot_id'])) {
            $model->relatedEntityTrustiotId = $map['related_entity_trustiot_id'];
        }

        return $model;
    }
}
