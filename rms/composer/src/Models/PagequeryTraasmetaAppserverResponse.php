<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTraasmetaAppserverResponse extends Model
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

    // app_servers
    /**
     * @var TraasAppServerDto[]
     */
    public $appServers;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    //
    // 总量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'appServers'  => 'app_servers',
        'pageSize'    => 'page_size',
        'currentPage' => 'current_page',
        'totalCount'  => 'total_count',
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
        if (null !== $this->appServers) {
            $res['app_servers'] = [];
            if (null !== $this->appServers && \is_array($this->appServers)) {
                $n = 0;
                foreach ($this->appServers as $item) {
                    $res['app_servers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTraasmetaAppserverResponse
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
        if (isset($map['app_servers'])) {
            if (!empty($map['app_servers'])) {
                $model->appServers = [];
                $n                 = 0;
                foreach ($map['app_servers'] as $item) {
                    $model->appServers[$n++] = null !== $item ? TraasAppServerDto::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
