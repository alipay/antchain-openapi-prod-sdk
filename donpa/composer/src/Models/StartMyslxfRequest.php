<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class StartMyslxfRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 待修复人列表
    /**
     * @var PersonData[]
     */
    public $repairPeopleList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'repairPeopleList'  => 'repair_people_list',
    ];

    public function validate()
    {
        Model::validateRequired('repairPeopleList', $this->repairPeopleList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->repairPeopleList) {
            $res['repair_people_list'] = [];
            if (null !== $this->repairPeopleList && \is_array($this->repairPeopleList)) {
                $n = 0;
                foreach ($this->repairPeopleList as $item) {
                    $res['repair_people_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMyslxfRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['repair_people_list'])) {
            if (!empty($map['repair_people_list'])) {
                $model->repairPeopleList = [];
                $n                       = 0;
                foreach ($map['repair_people_list'] as $item) {
                    $model->repairPeopleList[$n++] = null !== $item ? PersonData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
