<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ImportSolutioninstanceRequest extends Model
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

    // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
    /**
     * @var string
     */
    public $boxData;

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 工号
    /**
     * @var string
     */
    public $workNo;

    // 花名
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'boxData'           => 'box_data',
        'envId'             => 'env_id',
        'workNo'            => 'work_no',
        'name'              => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('boxData', $this->boxData, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('workNo', $this->workNo, true);
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
        if (null !== $this->boxData) {
            $res['box_data'] = $this->boxData;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportSolutioninstanceRequest
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
        if (isset($map['box_data'])) {
            $model->boxData = $map['box_data'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
