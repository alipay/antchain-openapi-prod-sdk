<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class ArSignTask extends Model
{
    // 证件号
    /**
     * @example 330108*****1231
     *
     * @var string
     */
    public $certNo;

    // 证件类型，比如：ID_CARD=身份证
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 客户编号
    /**
     * @example 20200810001220010000000000000001
     *
     * @var string
     */
    public $cmNo;

    // 姓名
    /**
     * @example 成吉思汗
     *
     * @var string
     */
    public $name;

    // 签署流程编号
    /**
     * @example 20200810001220110000000000000001
     *
     * @var string
     */
    public $procNo;

    // 合同签署地址
    /**
     * @example https://xxx
     *
     * @var string
     */
    public $signUrl;

    // 签署状态 ，比如：INIT=待签署
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // 智慧合同签署账号id
    /**
     * @example 668fa851746fdf358c5f96efe87
     *
     * @var string
     */
    public $mycAccountId;
    protected $_name = [
        'certNo'       => 'cert_no',
        'certType'     => 'cert_type',
        'cmNo'         => 'cm_no',
        'name'         => 'name',
        'procNo'       => 'proc_no',
        'signUrl'      => 'sign_url',
        'status'       => 'status',
        'mycAccountId' => 'myc_account_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->cmNo) {
            $res['cm_no'] = $this->cmNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->procNo) {
            $res['proc_no'] = $this->procNo;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->mycAccountId) {
            $res['myc_account_id'] = $this->mycAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArSignTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cm_no'])) {
            $model->cmNo = $map['cm_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['proc_no'])) {
            $model->procNo = $map['proc_no'];
        }
        if (isset($map['sign_url'])) {
            $model->signUrl = $map['sign_url'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['myc_account_id'])) {
            $model->mycAccountId = $map['myc_account_id'];
        }

        return $model;
    }
}
