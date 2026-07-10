<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryContentStatusResponse extends Model
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

    // 视频内容id
    /**
     * @var string
     */
    public $contentId;

    // 视频状态
    /**
     * @var string
     */
    public $status;

    // 内容标题
    /**
     * @var string
     */
    public $title;

    // 内容类型
    /**
     * @var string
     */
    public $type;

    // 标签列表
    /**
     * @var string[]
     */
    public $keywords;

    // 内容描述
    /**
     * @var string
     */
    public $description;

    // 内容封面文件地址
    /**
     * @var string
     */
    public $coverUrl;

    // 存证id
    /**
     * @var string
     */
    public $registerId;

    // 内容授权合同文件地址
    /**
     * @var string
     */
    public $authPdfUrl;

    // 播放列表名称
    /**
     * @var string
     */
    public $playListName;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'contentId'    => 'content_id',
        'status'       => 'status',
        'title'        => 'title',
        'type'         => 'type',
        'keywords'     => 'keywords',
        'description'  => 'description',
        'coverUrl'     => 'cover_url',
        'registerId'   => 'register_id',
        'authPdfUrl'   => 'auth_pdf_url',
        'playListName' => 'play_list_name',
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
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->coverUrl) {
            $res['cover_url'] = $this->coverUrl;
        }
        if (null !== $this->registerId) {
            $res['register_id'] = $this->registerId;
        }
        if (null !== $this->authPdfUrl) {
            $res['auth_pdf_url'] = $this->authPdfUrl;
        }
        if (null !== $this->playListName) {
            $res['play_list_name'] = $this->playListName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContentStatusResponse
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
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['keywords'])) {
            if (!empty($map['keywords'])) {
                $model->keywords = $map['keywords'];
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['cover_url'])) {
            $model->coverUrl = $map['cover_url'];
        }
        if (isset($map['register_id'])) {
            $model->registerId = $map['register_id'];
        }
        if (isset($map['auth_pdf_url'])) {
            $model->authPdfUrl = $map['auth_pdf_url'];
        }
        if (isset($map['play_list_name'])) {
            $model->playListName = $map['play_list_name'];
        }

        return $model;
    }
}
