<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpEmphasisInfo extends Model
{
    // ip的链上id
    /**
     * @example 160
     *
     * @var string
     */
    public $ipId;

    // ip的描述信息
    /**
     * @example aaaa
     *
     * @var string
     */
    public $description;

    // ip类型
    /**
     * @example 111
     *
     * @var string
     */
    public $ipType;

    // 受众群体（6位数字） 对应c
    /**
     * @example 000001
     *
     * @var string
     */
    public $audienceGroup;

    // 主图
    /**
     * @example oss://1;oss:2
     *
     * @var string
     */
    public $image;

    // 上架状态
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // 归属的账户id
    /**
     * @example 归属的账户id
     *
     * @var string
     */
    public $accountId;

    // 创建日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // ip名字
    /**
     * @example aaaa
     *
     * @var string
     */
    public $ipName;

    // 商户名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $accountName;
    protected $_name = [
        'ipId'          => 'ip_id',
        'description'   => 'description',
        'ipType'        => 'ip_type',
        'audienceGroup' => 'audience_group',
        'image'         => 'image',
        'status'        => 'status',
        'accountId'     => 'account_id',
        'createTime'    => 'create_time',
        'ipName'        => 'ip_name',
        'accountName'   => 'account_name',
    ];

    public function validate()
    {
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('ipType', $this->ipType, true);
        Model::validateRequired('audienceGroup', $this->audienceGroup, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpEmphasisInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['ip_type'])) {
            $model->ipType = $map['ip_type'];
        }
        if (isset($map['audience_group'])) {
            $model->audienceGroup = $map['audience_group'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }

        return $model;
    }
}
