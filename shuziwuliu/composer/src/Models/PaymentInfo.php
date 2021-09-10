<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PaymentInfo extends Model
{
    // 收款账户名称
    /**
     * @example 王大力
     *
     * @var string
     */
    public $receiverAccountName;

    // 收款账户，支付宝账号
    /**
     * @example xxx@sina.com
     *
     * @var string
     */
    public $receiverAccount;

    // 收款账户类型 ,1-个人账号，0-公司账号
    /**
     * @example 1
     *
     * @var string
     */
    public $receiverAccountType;

    // 收款人证件号码 ，账户类型为个人时，非空
    /**
     * @example 39991000299910029
     *
     * @var string
     */
    public $receiverCertificateNo;

    // 收款人证件类型，01-身份证，02-护照，03-军官证，04-港澳通行证，05-驾驶证，06-港澳回乡证或台胞证，07-临时身份证，99-其他
    /**
     * @example 01
     *
     * @var string
     */
    public $receiverCertificateType;
    protected $_name = [
        'receiverAccountName'     => 'receiver_account_name',
        'receiverAccount'         => 'receiver_account',
        'receiverAccountType'     => 'receiver_account_type',
        'receiverCertificateNo'   => 'receiver_certificate_no',
        'receiverCertificateType' => 'receiver_certificate_type',
    ];

    public function validate()
    {
        Model::validateRequired('receiverAccountName', $this->receiverAccountName, true);
        Model::validateRequired('receiverAccount', $this->receiverAccount, true);
        Model::validateRequired('receiverAccountType', $this->receiverAccountType, true);
        Model::validateRequired('receiverCertificateType', $this->receiverCertificateType, true);
        Model::validateMaxLength('receiverAccountName', $this->receiverAccountName, 200);
        Model::validateMaxLength('receiverAccount', $this->receiverAccount, 50);
        Model::validateMaxLength('receiverAccountType', $this->receiverAccountType, 2);
        Model::validateMaxLength('receiverCertificateNo', $this->receiverCertificateNo, 50);
        Model::validateMaxLength('receiverCertificateType', $this->receiverCertificateType, 2);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->receiverAccountName) {
            $res['receiver_account_name'] = $this->receiverAccountName;
        }
        if (null !== $this->receiverAccount) {
            $res['receiver_account'] = $this->receiverAccount;
        }
        if (null !== $this->receiverAccountType) {
            $res['receiver_account_type'] = $this->receiverAccountType;
        }
        if (null !== $this->receiverCertificateNo) {
            $res['receiver_certificate_no'] = $this->receiverCertificateNo;
        }
        if (null !== $this->receiverCertificateType) {
            $res['receiver_certificate_type'] = $this->receiverCertificateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['receiver_account_name'])) {
            $model->receiverAccountName = $map['receiver_account_name'];
        }
        if (isset($map['receiver_account'])) {
            $model->receiverAccount = $map['receiver_account'];
        }
        if (isset($map['receiver_account_type'])) {
            $model->receiverAccountType = $map['receiver_account_type'];
        }
        if (isset($map['receiver_certificate_no'])) {
            $model->receiverCertificateNo = $map['receiver_certificate_no'];
        }
        if (isset($map['receiver_certificate_type'])) {
            $model->receiverCertificateType = $map['receiver_certificate_type'];
        }

        return $model;
    }
}
