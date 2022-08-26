<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class DetailAntchainCarbonEcarAvitivedataRequest extends Model
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

    // 排放数据录入明细编码
    /**
     * @var string
     */
    public $emissionDataEntryItemNo;

    // 企业业务单号
    /**
     * @var string
     */
    public $enterpriseBizNo;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'emissionDataEntryItemNo' => 'emission_data_entry_item_no',
        'enterpriseBizNo'         => 'enterprise_biz_no',
    ];

    public function validate()
    {
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
        if (null !== $this->emissionDataEntryItemNo) {
            $res['emission_data_entry_item_no'] = $this->emissionDataEntryItemNo;
        }
        if (null !== $this->enterpriseBizNo) {
            $res['enterprise_biz_no'] = $this->enterpriseBizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAntchainCarbonEcarAvitivedataRequest
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
        if (isset($map['emission_data_entry_item_no'])) {
            $model->emissionDataEntryItemNo = $map['emission_data_entry_item_no'];
        }
        if (isset($map['enterprise_biz_no'])) {
            $model->enterpriseBizNo = $map['enterprise_biz_no'];
        }

        return $model;
    }
}
