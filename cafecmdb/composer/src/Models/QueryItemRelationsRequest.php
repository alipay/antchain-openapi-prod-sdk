<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class QueryItemRelationsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标模型id
    /**
     * @var string
     */
    public $destinationModelId;

    // item_id
    /**
     * @var string
     */
    public $itemId;

    // 1
    /**
     * @var int
     */
    public $pageSize;

    // page_number
    /**
     * @var int
     */
    public $pageNumber;

    // display_fields
    /**
     * @var string[]
     */
    public $displayFields;

    // 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
    /**
     * @var bool
     */
    public $drillUp;
    protected $_name = [
        'authToken'          => 'auth_token',
        'destinationModelId' => 'destination_model_id',
        'itemId'             => 'item_id',
        'pageSize'           => 'page_size',
        'pageNumber'         => 'page_number',
        'displayFields'      => 'display_fields',
        'drillUp'            => 'drill_up',
    ];

    public function validate()
    {
        Model::validateRequired('destinationModelId', $this->destinationModelId, true);
        Model::validateRequired('itemId', $this->itemId, true);
        Model::validateRequired('pageNumber', $this->pageNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->destinationModelId) {
            $res['destination_model_id'] = $this->destinationModelId;
        }
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->displayFields) {
            $res['display_fields'] = $this->displayFields;
        }
        if (null !== $this->drillUp) {
            $res['drill_up'] = $this->drillUp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryItemRelationsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['destination_model_id'])) {
            $model->destinationModelId = $map['destination_model_id'];
        }
        if (isset($map['item_id'])) {
            $model->itemId = $map['item_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['display_fields'])) {
            if (!empty($map['display_fields'])) {
                $model->displayFields = $map['display_fields'];
            }
        }
        if (isset($map['drill_up'])) {
            $model->drillUp = $map['drill_up'];
        }

        return $model;
    }
}
