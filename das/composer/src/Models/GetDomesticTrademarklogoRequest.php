<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class GetDomesticTrademarklogoRequest extends Model
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

    // 数据集ID
    /**
     * @var string
     */
    public $dataSetId;

    // 商标注册证号
    /**
     * @var string
     */
    public $tmRegNum;

    // 商标类别
    /**
     * @var string
     */
    public $tmFormType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSetId'         => 'data_set_id',
        'tmRegNum'          => 'tm_reg_num',
        'tmFormType'        => 'tm_form_type',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('tmRegNum', $this->tmRegNum, true);
        Model::validateRequired('tmFormType', $this->tmFormType, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->tmRegNum) {
            $res['tm_reg_num'] = $this->tmRegNum;
        }
        if (null !== $this->tmFormType) {
            $res['tm_form_type'] = $this->tmFormType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDomesticTrademarklogoRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['tm_reg_num'])) {
            $model->tmRegNum = $map['tm_reg_num'];
        }
        if (isset($map['tm_form_type'])) {
            $model->tmFormType = $map['tm_form_type'];
        }

        return $model;
    }
}
