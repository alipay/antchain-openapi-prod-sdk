<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidServicesRequest extends Model
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

    // 新增的服务信息
    /**
     * @var DidDocServicesInfo[]
     */
    public $addSevices;

    // 要删除的服务id列表
    /**
     * @var string[]
     */
    public $delServices;

    // 指定要更新的did
    /**
     * @var string
     */
    public $did;

    // did类型，个人|企业|设备(IOT)
    /**
     * @var string
     */
    public $didType;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'addSevices'        => 'add_sevices',
        'delServices'       => 'del_services',
        'did'               => 'did',
        'didType'           => 'did_type',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('didType', $this->didType, true);
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
        if (null !== $this->addSevices) {
            $res['add_sevices'] = [];
            if (null !== $this->addSevices && \is_array($this->addSevices)) {
                $n = 0;
                foreach ($this->addSevices as $item) {
                    $res['add_sevices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->delServices) {
            $res['del_services'] = $this->delServices;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->didType) {
            $res['did_type'] = $this->didType;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidServicesRequest
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
        if (isset($map['add_sevices'])) {
            if (!empty($map['add_sevices'])) {
                $model->addSevices = [];
                $n                 = 0;
                foreach ($map['add_sevices'] as $item) {
                    $model->addSevices[$n++] = null !== $item ? DidDocServicesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['del_services'])) {
            if (!empty($map['del_services'])) {
                $model->delServices = $map['del_services'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['did_type'])) {
            $model->didType = $map['did_type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
