<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class RegisterCdsqTireinsuranceRequest extends Model
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

    // 平台名称
    /**
     * @var string
     */
    public $partnerCode;

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 用户ID
    /**
     * @var string
     */
    public $userid;

    // 方案名称
    // 代步车+置换、轮
    // 胎险+置换、代步
    // 车、四轮轮胎险、
    // 置换、二轮轮胎险
    /**
     * @var string
     */
    public $schemeName;

    // 购买时间
    /**
     * @var string
     */
    public $buytime;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partnerCode'       => 'partner_code',
        'transactionNo'     => 'transaction_no',
        'userid'            => 'userid',
        'schemeName'        => 'scheme_name',
        'buytime'           => 'buytime',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('partnerCode', $this->partnerCode, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->buytime) {
            $res['buytime'] = $this->buytime;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterCdsqTireinsuranceRequest
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
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['buytime'])) {
            $model->buytime = $map['buytime'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
