<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuditVideobaseRequest extends Model
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

    // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
    // 说明 ：
    // 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
    // 2. 视频文件链接支持以下协议：HTTP和HTTPS。
    // 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。
    // 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
    /**
     * @var string
     */
    public $url;

    // 审核场景类型
    // 目前支持通用版 BASE_VIDEO_SEC
    /**
     * @var string
     */
    public $scene;

    // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    /**
     * @var string
     */
    public $dataId;

    // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    /**
     * @var string
     */
    public $businessId;

    // 结果通知地址，不指定时需要调用方主动查询结果
    /**
     * @var string
     */
    public $callback;

    // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
    /**
     * @var string
     */
    public $seed;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'url'               => 'url',
        'scene'             => 'scene',
        'dataId'            => 'data_id',
        'businessId'        => 'business_id',
        'callback'          => 'callback',
        'seed'              => 'seed',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->seed) {
            $res['seed'] = $this->seed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuditVideobaseRequest
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
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['seed'])) {
            $model->seed = $map['seed'];
        }

        return $model;
    }
}
