<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class GetProviderResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // API前缀
    /**
     * @var string
     */
    public $apiNamePrefix;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 是否在开发者中心展示
    /**
     * @var bool
     */
    public $developerCenterDisplay;

    // Proivder名称，等同于产品码
    /**
     * @var string
     */
    public $name;

    // 产品别名
    /**
     * @var string
     */
    public $nameAlias;

    // 组织机构
    /**
     * @var string
     */
    public $organization;

    // 产品类型
    /**
     * @var string
     */
    public $providerType;

    // 产品状态
    /**
     * @var string
     */
    public $status;

    // 产品简介
    /**
     * @var string
     */
    public $summary;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'apiNamePrefix'          => 'api_name_prefix',
        'description'            => 'description',
        'developerCenterDisplay' => 'developer_center_display',
        'name'                   => 'name',
        'nameAlias'              => 'name_alias',
        'organization'           => 'organization',
        'providerType'           => 'provider_type',
        'status'                 => 'status',
        'summary'                => 'summary',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->apiNamePrefix) {
            $res['api_name_prefix'] = $this->apiNamePrefix;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->developerCenterDisplay) {
            $res['developer_center_display'] = $this->developerCenterDisplay;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nameAlias) {
            $res['name_alias'] = $this->nameAlias;
        }
        if (null !== $this->organization) {
            $res['organization'] = $this->organization;
        }
        if (null !== $this->providerType) {
            $res['provider_type'] = $this->providerType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetProviderResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['api_name_prefix'])) {
            $model->apiNamePrefix = $map['api_name_prefix'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['developer_center_display'])) {
            $model->developerCenterDisplay = $map['developer_center_display'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['name_alias'])) {
            $model->nameAlias = $map['name_alias'];
        }
        if (isset($map['organization'])) {
            $model->organization = $map['organization'];
        }
        if (isset($map['provider_type'])) {
            $model->providerType = $map['provider_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }

        return $model;
    }
}
