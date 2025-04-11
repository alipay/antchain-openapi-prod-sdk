<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryIndexresearchBrandindexResponse extends Model
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

    // page_info
    /**
     * @var PageInfo
     */
    public $pageInfo;

    // index_data
    /**
     * @var IndexData[]
     */
    public $indexData;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pageInfo'   => 'page_info',
        'indexData'  => 'index_data',
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
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->indexData) {
            $res['index_data'] = [];
            if (null !== $this->indexData && \is_array($this->indexData)) {
                $n = 0;
                foreach ($this->indexData as $item) {
                    $res['index_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIndexresearchBrandindexResponse
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
        if (isset($map['page_info'])) {
            $model->pageInfo = PageInfo::fromMap($map['page_info']);
        }
        if (isset($map['index_data'])) {
            if (!empty($map['index_data'])) {
                $model->indexData = [];
                $n                = 0;
                foreach ($map['index_data'] as $item) {
                    $model->indexData[$n++] = null !== $item ? IndexData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
