<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class QueryItemRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // display_fields
    /**
     * @var string[]
     */
    public $displayFields;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // page_number
    /**
     * @var int
     */
    public $pageNumber;

    // sort_fields
    /**
     * @var string[]
     */
    public $sortFields;

    // conditions
    /**
     * @var Condition[]
     */
    public $conditions;

    // filter
    /**
     * @var Filter
     */
    public $filter;

    // model_id
    /**
     * @var string
     */
    public $modelId;
    protected $_name = [
        'authToken'     => 'auth_token',
        'displayFields' => 'display_fields',
        'pageSize'      => 'page_size',
        'pageNumber'    => 'page_number',
        'sortFields'    => 'sort_fields',
        'conditions'    => 'conditions',
        'filter'        => 'filter',
        'modelId'       => 'model_id',
    ];

    public function validate()
    {
        Model::validateRequired('conditions', $this->conditions, true);
        Model::validateRequired('modelId', $this->modelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->displayFields) {
            $res['display_fields'] = $this->displayFields;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->sortFields) {
            $res['sort_fields'] = $this->sortFields;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->filter) {
            $res['filter'] = null !== $this->filter ? $this->filter->toMap() : null;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryItemRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['display_fields'])) {
            if (!empty($map['display_fields'])) {
                $model->displayFields = $map['display_fields'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['sort_fields'])) {
            if (!empty($map['sort_fields'])) {
                $model->sortFields = $map['sort_fields'];
            }
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['filter'])) {
            $model->filter = Filter::fromMap($map['filter']);
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }

        return $model;
    }
}
