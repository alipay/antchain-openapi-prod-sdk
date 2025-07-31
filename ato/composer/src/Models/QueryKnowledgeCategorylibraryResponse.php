<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryKnowledgeCategorylibraryResponse extends Model
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

    // 知识库id
    /**
     * @var string
     */
    public $libraryId;

    // 知识库名称
    /**
     * @var string
     */
    public $libraryName;

    // 类目id
    /**
     * @var string
     */
    public $categoryId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'libraryId'   => 'library_id',
        'libraryName' => 'library_name',
        'categoryId'  => 'category_id',
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
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->libraryName) {
            $res['library_name'] = $this->libraryName;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryKnowledgeCategorylibraryResponse
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
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['library_name'])) {
            $model->libraryName = $map['library_name'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }

        return $model;
    }
}
