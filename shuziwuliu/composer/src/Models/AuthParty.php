<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class AuthParty extends Model
{
    // 签署方名称
    /**
     * @example 贾玲
     *
     * @var string
     */
    public $signPartyName;

    // 签署方证件类型，可以填写的枚举类：IDENTIFICATION_CARD，表示身份证
    /**
     * @example IDENTIFICATION_CARD
     *
     * @var string
     */
    public $signPartyCertType;

    // 签署方证件号码
    /**
     * @example 3308199612247856
     *
     * @var string
     */
    public $signPartyCertNum;

    // 签署结果（必填，FINISH,FAIL,REFUSE三者选一，分别表示签署完成、失败和拒签）
    /**
     * @example FINISH
     *
     * @var string
     */
    public $signResult;

    // 签署失败或拒签原因（失败或拒签时必填）
    /**
     * @example 审批未通过
     *
     * @var string
     */
    public $signFailReason;

    // 签署时间(13位毫秒时间戳)
    /**
     * @example 2881999301656
     *
     * @var string
     */
    public $signTime;
    protected $_name = [
        'signPartyName'     => 'sign_party_name',
        'signPartyCertType' => 'sign_party_cert_type',
        'signPartyCertNum'  => 'sign_party_cert_num',
        'signResult'        => 'sign_result',
        'signFailReason'    => 'sign_fail_reason',
        'signTime'          => 'sign_time',
    ];

    public function validate()
    {
        Model::validateRequired('signPartyName', $this->signPartyName, true);
        Model::validateRequired('signPartyCertType', $this->signPartyCertType, true);
        Model::validateRequired('signPartyCertNum', $this->signPartyCertNum, true);
        Model::validateRequired('signResult', $this->signResult, true);
        Model::validateRequired('signTime', $this->signTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signPartyName) {
            $res['sign_party_name'] = $this->signPartyName;
        }
        if (null !== $this->signPartyCertType) {
            $res['sign_party_cert_type'] = $this->signPartyCertType;
        }
        if (null !== $this->signPartyCertNum) {
            $res['sign_party_cert_num'] = $this->signPartyCertNum;
        }
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        if (null !== $this->signFailReason) {
            $res['sign_fail_reason'] = $this->signFailReason;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthParty
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_party_name'])) {
            $model->signPartyName = $map['sign_party_name'];
        }
        if (isset($map['sign_party_cert_type'])) {
            $model->signPartyCertType = $map['sign_party_cert_type'];
        }
        if (isset($map['sign_party_cert_num'])) {
            $model->signPartyCertNum = $map['sign_party_cert_num'];
        }
        if (isset($map['sign_result'])) {
            $model->signResult = $map['sign_result'];
        }
        if (isset($map['sign_fail_reason'])) {
            $model->signFailReason = $map['sign_fail_reason'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }

        return $model;
    }
}
