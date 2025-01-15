<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryDocResponse extends Model
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

    // 内部id
    /**
     * @var int
     */
    public $id;

    // 文档id
    /**
     * @var string
     */
    public $docId;

    // 文档标题
    /**
     * @var string
     */
    public $title;

    // 站点
    /**
     * @var string
     */
    public $site;

    // 语言code
    /**
     * @var string
     */
    public $language;

    // 内容
    /**
     * @var string
     */
    public $content;

    // 类型
    /**
     * @var int
     */
    public $sourceType;

    // 最后修改时间
    /**
     * @var int
     */
    public $extModifiedTime;

    // 关键字
    /**
     * @var string
     */
    public $keyWords;

    // 显示类型
    /**
     * @var int
     */
    public $showType;

    // 页面上下文
    /**
     * @var PageContext[]
     */
    public $pageContext;

    // 内容对象
    //
    //
    /**
     * @var ContentObjVO[]
     */
    public $contentObj;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'id'              => 'id',
        'docId'           => 'doc_id',
        'title'           => 'title',
        'site'            => 'site',
        'language'        => 'language',
        'content'         => 'content',
        'sourceType'      => 'source_type',
        'extModifiedTime' => 'ext_modified_time',
        'keyWords'        => 'key_words',
        'showType'        => 'show_type',
        'pageContext'     => 'page_context',
        'contentObj'      => 'content_obj',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->site) {
            $res['site'] = $this->site;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->extModifiedTime) {
            $res['ext_modified_time'] = $this->extModifiedTime;
        }
        if (null !== $this->keyWords) {
            $res['key_words'] = $this->keyWords;
        }
        if (null !== $this->showType) {
            $res['show_type'] = $this->showType;
        }
        if (null !== $this->pageContext) {
            $res['page_context'] = [];
            if (null !== $this->pageContext && \is_array($this->pageContext)) {
                $n = 0;
                foreach ($this->pageContext as $item) {
                    $res['page_context'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contentObj) {
            $res['content_obj'] = [];
            if (null !== $this->contentObj && \is_array($this->contentObj)) {
                $n = 0;
                foreach ($this->contentObj as $item) {
                    $res['content_obj'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDocResponse
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['site'])) {
            $model->site = $map['site'];
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['ext_modified_time'])) {
            $model->extModifiedTime = $map['ext_modified_time'];
        }
        if (isset($map['key_words'])) {
            $model->keyWords = $map['key_words'];
        }
        if (isset($map['show_type'])) {
            $model->showType = $map['show_type'];
        }
        if (isset($map['page_context'])) {
            if (!empty($map['page_context'])) {
                $model->pageContext = [];
                $n                  = 0;
                foreach ($map['page_context'] as $item) {
                    $model->pageContext[$n++] = null !== $item ? PageContext::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['content_obj'])) {
            if (!empty($map['content_obj'])) {
                $model->contentObj = [];
                $n                 = 0;
                foreach ($map['content_obj'] as $item) {
                    $model->contentObj[$n++] = null !== $item ? ContentObjVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
