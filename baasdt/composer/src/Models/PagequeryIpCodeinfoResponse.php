<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpCodeinfoResponse extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 页面数据量大小
    /**
     * @var int
     */
    public $pageSize;

    // 领取到的正版码总数
    /**
     * @var int
     */
    public $codeCount;

    // 正版码列表信息
    /**
     * @var IPCodeScannedInfo[]
     */
    public $codeList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pageNumber' => 'page_number',
        'pageSize'   => 'page_size',
        'codeCount'  => 'code_count',
        'codeList'   => 'code_list',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->codeCount) {
            $res['code_count'] = $this->codeCount;
        }
        if (null !== $this->codeList) {
            $res['code_list'] = [];
            if (null !== $this->codeList && \is_array($this->codeList)) {
                $n = 0;
                foreach ($this->codeList as $item) {
                    $res['code_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpCodeinfoResponse
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
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['code_count'])) {
            $model->codeCount = $map['code_count'];
        }
        if (isset($map['code_list'])) {
            if (!empty($map['code_list'])) {
                $model->codeList = [];
                $n               = 0;
                foreach ($map['code_list'] as $item) {
                    $model->codeList[$n++] = null !== $item ? IPCodeScannedInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
