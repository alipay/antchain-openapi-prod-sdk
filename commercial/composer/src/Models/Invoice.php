<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class Invoice extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 用户id
    /**
     * @example 2088124521254
     *
     * @var string
     */
    public $userId;

    // 纳税人类型
    /**
     * @example GENERAL
     *
     * @var string
     */
    public $taxpayerType;

    // 纳税人名称
    /**
     * @example 数科有限公司
     *
     * @var string
     */
    public $taxpayerName;

    // 纳税人识别号
    /**
     * @example 201200103401023401234
     *
     * @var string
     */
    public $taxpayerNo;

    // 开户行名称
    /**
     * @example 北京银行海淀支行
     *
     * @var string
     */
    public $bankName;

    // 开户行账号
    /**
     * @example 60122333123409434
     *
     * @var string
     */
    public $bankAccount;

    // 开户行地址
    /**
     * @example 北京市东三环中路1号
     *
     * @var string
     */
    public $address;

    // 开户行电话
    /**
     * @example 010854423598
     *
     * @var string
     */
    public $telephone;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 唯一id
    /**
     * @example 20211216192140IE0800000001
     *
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'id'           => 'id',
        'userId'       => 'user_id',
        'taxpayerType' => 'taxpayer_type',
        'taxpayerName' => 'taxpayer_name',
        'taxpayerNo'   => 'taxpayer_no',
        'bankName'     => 'bank_name',
        'bankAccount'  => 'bank_account',
        'address'      => 'address',
        'telephone'    => 'telephone',
        'gmtModified'  => 'gmt_modified',
        'gmtCreate'    => 'gmt_create',
        'uniqueId'     => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('taxpayerType', $this->taxpayerType, true);
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->taxpayerType) {
            $res['taxpayer_type'] = $this->taxpayerType;
        }
        if (null !== $this->taxpayerName) {
            $res['taxpayer_name'] = $this->taxpayerName;
        }
        if (null !== $this->taxpayerNo) {
            $res['taxpayer_no'] = $this->taxpayerNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Invoice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['taxpayer_type'])) {
            $model->taxpayerType = $map['taxpayer_type'];
        }
        if (isset($map['taxpayer_name'])) {
            $model->taxpayerName = $map['taxpayer_name'];
        }
        if (isset($map['taxpayer_no'])) {
            $model->taxpayerNo = $map['taxpayer_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_account'])) {
            $model->bankAccount = $map['bank_account'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['telephone'])) {
            $model->telephone = $map['telephone'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
