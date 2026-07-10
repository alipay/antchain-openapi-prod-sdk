<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class DirectMonitorResult extends Model
{
    // 监测结果id
    /**
     * @example xyz
     *
     * @var string
     */
    public $monitorResultId;

    // 相似的资源链接
    /**
     * @example xyz
     *
     * @var string
     */
    public $similarResourceUrl;

    // 相似资源所在的网址链接
    /**
     * @example xyz
     *
     * @var string
     */
    public $similarWebUrl;

    // 资源标题
    /**
     * @example xyz
     *
     * @var string
     */
    public $title;

    // 资源作者
    /**
     * @example xyz
     *
     * @var string
     */
    public $author;

    // 资源上传时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @example 2022-01-01 10:10:10
     *
     * @var string
     */
    public $uploadTime;
    protected $_name = [
        'monitorResultId'    => 'monitor_result_id',
        'similarResourceUrl' => 'similar_resource_url',
        'similarWebUrl'      => 'similar_web_url',
        'title'              => 'title',
        'author'             => 'author',
        'uploadTime'         => 'upload_time',
    ];

    public function validate()
    {
        Model::validateRequired('monitorResultId', $this->monitorResultId, true);
        Model::validateRequired('similarResourceUrl', $this->similarResourceUrl, true);
        Model::validateRequired('similarWebUrl', $this->similarWebUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->monitorResultId) {
            $res['monitor_result_id'] = $this->monitorResultId;
        }
        if (null !== $this->similarResourceUrl) {
            $res['similar_resource_url'] = $this->similarResourceUrl;
        }
        if (null !== $this->similarWebUrl) {
            $res['similar_web_url'] = $this->similarWebUrl;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->uploadTime) {
            $res['upload_time'] = $this->uploadTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DirectMonitorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['monitor_result_id'])) {
            $model->monitorResultId = $map['monitor_result_id'];
        }
        if (isset($map['similar_resource_url'])) {
            $model->similarResourceUrl = $map['similar_resource_url'];
        }
        if (isset($map['similar_web_url'])) {
            $model->similarWebUrl = $map['similar_web_url'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['upload_time'])) {
            $model->uploadTime = $map['upload_time'];
        }

        return $model;
    }
}
