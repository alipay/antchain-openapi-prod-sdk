<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class BindCarrierRepairmobileRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 失联修复初始化的流程ID
    /**
     * @var string
     */
    public $processId;

    // 身份证号，和失联修复初始化接口身份证号加密方式保持一致
    /**
     * @var string
     */
    public $certNo;

    // 修复的手机号排序，例如绑定第一个修复手机号填入1
    /**
     * @var string
     */
    public $mobileNum;

    // 主叫号码
    /**
     * @var string
     */
    public $mobileA;

    // 主叫类型1-手机号码 2-固话
    // 默认为1
    /**
     * @var string
     */
    public $mobileType;

    // 场景值
    /**
     * @var string
     */
    public $scene;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'processId'         => 'process_id',
        'certNo'            => 'cert_no',
        'mobileNum'         => 'mobile_num',
        'mobileA'           => 'mobile_a',
        'mobileType'        => 'mobile_type',
        'scene'             => 'scene',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobileNum', $this->mobileNum, true);
        Model::validateRequired('mobileA', $this->mobileA, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobileNum) {
            $res['mobile_num'] = $this->mobileNum;
        }
        if (null !== $this->mobileA) {
            $res['mobile_a'] = $this->mobileA;
        }
        if (null !== $this->mobileType) {
            $res['mobile_type'] = $this->mobileType;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCarrierRepairmobileRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile_num'])) {
            $model->mobileNum = $map['mobile_num'];
        }
        if (isset($map['mobile_a'])) {
            $model->mobileA = $map['mobile_a'];
        }
        if (isset($map['mobile_type'])) {
            $model->mobileType = $map['mobile_type'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
