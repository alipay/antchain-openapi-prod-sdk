<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateMonitorTaskRequest extends Model
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

    // submitType是url就传 url地址 submitType 是file就传 oss fileId
    /**
     * @var string
     */
    public $submitContent;

    // 提交任务的类型:FILE/URL
    // 不填为FILE
    // FILE表示文件上传素材，URL表示上传URL
    /**
     * @var string
     */
    public $submitType;

    // 文件类别
    //
    // IMAGE
    //
    // TEXT
    //
    // VIDEO
    /**
     * @var string
     */
    public $fileType;

    // 任务名称(不超过100字符)
    /**
     * @var string
     */
    public $taskName;

    // 监测任务标题(不超过100字符)
    /**
     * @var string
     */
    public $contentTitle;

    // 关键词(不超过200字符)
    /**
     * @var string[]
     */
    public $keywords;

    // 内容表述(不超过1000字符)
    /**
     * @var string
     */
    public $contentDesc;

    // 监测供应商id
    /**
     * @var string
     */
    public $providerId;

    // 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
    /**
     * @var string[]
     */
    public $scopes;

    // 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
    /**
     * @var int
     */
    public $taskStart;

    // 任务持续时间，单位天，默认90天
    //
    // 一次性监测：0
    /**
     * @var int
     */
    public $taskDuration;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'submitContent'     => 'submit_content',
        'submitType'        => 'submit_type',
        'fileType'          => 'file_type',
        'taskName'          => 'task_name',
        'contentTitle'      => 'content_title',
        'keywords'          => 'keywords',
        'contentDesc'       => 'content_desc',
        'providerId'        => 'provider_id',
        'scopes'            => 'scopes',
        'taskStart'         => 'task_start',
        'taskDuration'      => 'task_duration',
        'proxyInfo'         => 'proxy_info',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('submitContent', $this->submitContent, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('contentTitle', $this->contentTitle, true);
        Model::validateRequired('keywords', $this->keywords, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->submitContent) {
            $res['submit_content'] = $this->submitContent;
        }
        if (null !== $this->submitType) {
            $res['submit_type'] = $this->submitType;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->contentTitle) {
            $res['content_title'] = $this->contentTitle;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->contentDesc) {
            $res['content_desc'] = $this->contentDesc;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->taskStart) {
            $res['task_start'] = $this->taskStart;
        }
        if (null !== $this->taskDuration) {
            $res['task_duration'] = $this->taskDuration;
        }
        if (null !== $this->proxyInfo) {
            $res['proxy_info'] = null !== $this->proxyInfo ? $this->proxyInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMonitorTaskRequest
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
        if (isset($map['submit_content'])) {
            $model->submitContent = $map['submit_content'];
        }
        if (isset($map['submit_type'])) {
            $model->submitType = $map['submit_type'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['content_title'])) {
            $model->contentTitle = $map['content_title'];
        }
        if (isset($map['keywords'])) {
            if (!empty($map['keywords'])) {
                $model->keywords = $map['keywords'];
            }
        }
        if (isset($map['content_desc'])) {
            $model->contentDesc = $map['content_desc'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['scopes'])) {
            if (!empty($map['scopes'])) {
                $model->scopes = $map['scopes'];
            }
        }
        if (isset($map['task_start'])) {
            $model->taskStart = $map['task_start'];
        }
        if (isset($map['task_duration'])) {
            $model->taskDuration = $map['task_duration'];
        }
        if (isset($map['proxy_info'])) {
            $model->proxyInfo = ProxyData::fromMap($map['proxy_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
