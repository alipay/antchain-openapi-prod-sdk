<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class AuthRecord extends Model
{
    // 被授权租户名称：
    // 身份证号/统一社会组织机构信用码
    /**
     * @example xxxx农商行
     *
     * @var string
     */
    public $authorizedName;

    // 授权协议规则
    /**
     * @example
     *
     * @var AuthAgreement
     */
    public $authAgreement;

    // 授权码
    //
    //
    /**
     * @example 02xeeewr
     *
     * @var string
     */
    public $authCode;

    // 授权时间
    //
    /**
     * @example 2014-07-24 03:07:50
     *
     * @var string
     */
    public $authDate;

    // 授权有效状态：
    // 1、生效中、
    // 0、失效
    //
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $authStatus;

    // 链的信息
    /**
     * @example
     *
     * @var ChainInfo
     */
    public $chainInfo;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    /**
     * @example 3408012000xxxxx/95xxxxxxx
     *
     * @var string
     */
    public $dataOwnerIdentity;

    // 授权用户名称
    /**
     * @example 张三/张三集团有限公司
     *
     * @var string
     */
    public $dataOwnerName;

    // 扩展字段，与target_name拼成可见的授权详情name
    //
    //
    /**
     * @example {  "district":"太原",  "file":"",  "assets":""  }
     *
     * @var string
     */
    public $extendParams;

    // 标的物名称
    //
    //
    /**
     * @example 公积金缴存证明
     *
     * @var string
     */
    public $targetName;

    // 授权可信数据
    /**
     * @example dsfsfds
     *
     * @var string
     */
    public $teeData;
    protected $_name = [
        'authorizedName'    => 'authorized_name',
        'authAgreement'     => 'auth_agreement',
        'authCode'          => 'auth_code',
        'authDate'          => 'auth_date',
        'authStatus'        => 'auth_status',
        'chainInfo'         => 'chain_info',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataOwnerName'     => 'data_owner_name',
        'extendParams'      => 'extend_params',
        'targetName'        => 'target_name',
        'teeData'           => 'tee_data',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedName', $this->authorizedName, true);
        Model::validateRequired('authAgreement', $this->authAgreement, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('authDate', $this->authDate, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
        Model::validateRequired('chainInfo', $this->chainInfo, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
        Model::validateRequired('extendParams', $this->extendParams, true);
        Model::validateRequired('targetName', $this->targetName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorizedName) {
            $res['authorized_name'] = $this->authorizedName;
        }
        if (null !== $this->authAgreement) {
            $res['auth_agreement'] = null !== $this->authAgreement ? $this->authAgreement->toMap() : null;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->authDate) {
            $res['auth_date'] = $this->authDate;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->chainInfo) {
            $res['chain_info'] = null !== $this->chainInfo ? $this->chainInfo->toMap() : null;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->teeData) {
            $res['tee_data'] = $this->teeData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorized_name'])) {
            $model->authorizedName = $map['authorized_name'];
        }
        if (isset($map['auth_agreement'])) {
            $model->authAgreement = AuthAgreement::fromMap($map['auth_agreement']);
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['auth_date'])) {
            $model->authDate = $map['auth_date'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['chain_info'])) {
            $model->chainInfo = ChainInfo::fromMap($map['chain_info']);
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['tee_data'])) {
            $model->teeData = $map['tee_data'];
        }

        return $model;
    }
}
