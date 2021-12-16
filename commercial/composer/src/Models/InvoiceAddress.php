<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class InvoiceAddress extends Model
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

    // 收件人
    /**
     * @example 张三
     *
     * @var string
     */
    public $addressee;

    // 地区
    /**
     * @example 北京
     *
     * @var string
     */
    public $area;

    // 地址
    /**
     * @example 东三环中路1号
     *
     * @var string
     */
    public $address;

    // 电话
    /**
     * @example 01085451247
     *
     * @var string
     */
    public $telephone;

    // 邮编
    /**
     * @example 110000
     *
     * @var string
     */
    public $postCode;

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
        'id'          => 'id',
        'userId'      => 'user_id',
        'addressee'   => 'addressee',
        'area'        => 'area',
        'address'     => 'address',
        'telephone'   => 'telephone',
        'postCode'    => 'post_code',
        'gmtModified' => 'gmt_modified',
        'gmtCreate'   => 'gmt_create',
        'uniqueId'    => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('addressee', $this->addressee, true);
        Model::validateRequired('area', $this->area, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('telephone', $this->telephone, true);
        Model::validateRequired('postCode', $this->postCode, true);
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
        if (null !== $this->addressee) {
            $res['addressee'] = $this->addressee;
        }
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }
        if (null !== $this->postCode) {
            $res['post_code'] = $this->postCode;
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
     * @return InvoiceAddress
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
        if (isset($map['addressee'])) {
            $model->addressee = $map['addressee'];
        }
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['telephone'])) {
            $model->telephone = $map['telephone'];
        }
        if (isset($map['post_code'])) {
            $model->postCode = $map['post_code'];
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
