<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpCodecirculationResponse extends Model
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

    // 正版码流转信息列表
    /**
     * @var CodeCirculation[]
     */
    public $codeCirculationList;

    // 正版码的流转信息总数
    /**
     * @var int
     */
    public $totalCount;

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
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'codeCirculationList' => 'code_circulation_list',
        'totalCount'          => 'total_count',
        'pageNumber'          => 'page_number',
        'pageSize'            => 'page_size',
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
        if (null !== $this->codeCirculationList) {
            $res['code_circulation_list'] = [];
            if (null !== $this->codeCirculationList && \is_array($this->codeCirculationList)) {
                $n = 0;
                foreach ($this->codeCirculationList as $item) {
                    $res['code_circulation_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpCodecirculationResponse
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
        if (isset($map['code_circulation_list'])) {
            if (!empty($map['code_circulation_list'])) {
                $model->codeCirculationList = [];
                $n                          = 0;
                foreach ($map['code_circulation_list'] as $item) {
                    $model->codeCirculationList[$n++] = null !== $item ? CodeCirculation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
