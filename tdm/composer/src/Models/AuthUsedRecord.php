<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class AuthUsedRecord extends Model
{
    // 被授权租户名称：
    //
    // 身份证号/统一社会组织机构信用码
    //
    //
    /**
     * @example xxxx农商行
     *
     * @var string
     */
    public $authorizedName;

    // 授权码
    //
    //
    /**
     * @example 0x32423443234
     *
     * @var string
     */
    public $authCode;

    // 链的信息
    /**
     * @example
     *
     * @var ChainInfo
     */
    public $chainInfo;

    // 扩展字段
    /**
     * @example {  "districtName":"太原公积金",  "file":"",  "assets":""  }
     *
     * @var string
     */
    public $extendParams;

    // 标的物,产品码名称
    //
    //
    /**
     * @example 异地公积金缴存证明
     *
     * @var string
     */
    public $targetName;

    // 授权可信内容
    /**
     * @example sdkfsldfk
     *
     * @var string
     */
    public $teeData;

    // 数据使用时间
    //
    //
    /**
     * @example 2014-07-24 03:07:50
     *
     * @var string
     */
    public $useDate;
    protected $_name = [
        'authorizedName' => 'authorized_name',
        'authCode'       => 'auth_code',
        'chainInfo'      => 'chain_info',
        'extendParams'   => 'extend_params',
        'targetName'     => 'target_name',
        'teeData'        => 'tee_data',
        'useDate'        => 'use_date',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedName', $this->authorizedName, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('chainInfo', $this->chainInfo, true);
        Model::validateRequired('extendParams', $this->extendParams, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('useDate', $this->useDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorizedName) {
            $res['authorized_name'] = $this->authorizedName;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->chainInfo) {
            $res['chain_info'] = null !== $this->chainInfo ? $this->chainInfo->toMap() : null;
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
        if (null !== $this->useDate) {
            $res['use_date'] = $this->useDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthUsedRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorized_name'])) {
            $model->authorizedName = $map['authorized_name'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['chain_info'])) {
            $model->chainInfo = ChainInfo::fromMap($map['chain_info']);
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
        if (isset($map['use_date'])) {
            $model->useDate = $map['use_date'];
        }

        return $model;
    }
}
