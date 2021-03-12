<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidAgentSidekeyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 新增的外键
    /**
     * @var string[]
     */
    public $addIndexs;

    // 去掉哪些外键
    /**
     * @var string[]
     */
    public $deleteIndexs;

    // 指定did进行外键关联
    /**
     * @var string
     */
    public $did;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'addIndexs'         => 'add_indexs',
        'deleteIndexs'      => 'delete_indexs',
        'did'               => 'did',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->addIndexs) {
            $res['add_indexs'] = $this->addIndexs;
        }
        if (null !== $this->deleteIndexs) {
            $res['delete_indexs'] = $this->deleteIndexs;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidAgentSidekeyRequest
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
        if (isset($map['add_indexs'])) {
            if (!empty($map['add_indexs'])) {
                $model->addIndexs = $map['add_indexs'];
            }
        }
        if (isset($map['delete_indexs'])) {
            if (!empty($map['delete_indexs'])) {
                $model->deleteIndexs = $map['delete_indexs'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
