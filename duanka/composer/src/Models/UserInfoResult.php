<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class UserInfoResult extends Model
{
    // hr主数据接口调用结果
    /**
     * @example true
     *
     * @var bool
     */
    public $success;

    // 调用信息
    /**
     * @example workNoList:[] must not null
     *
     * @var string
     */
    public $message;

    // 错误码
    /**
     * @example 错误码
     *
     * @var string
     */
    public $errorCode;

    // 查询结果
    /**
     * @example
     *
     * @var QueryResult[]
     */
    public $queryResultList;
    protected $_name = [
        'success'         => 'success',
        'message'         => 'message',
        'errorCode'       => 'error_code',
        'queryResultList' => 'query_result_list',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('queryResultList', $this->queryResultList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->queryResultList) {
            $res['query_result_list'] = [];
            if (null !== $this->queryResultList && \is_array($this->queryResultList)) {
                $n = 0;
                foreach ($this->queryResultList as $item) {
                    $res['query_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserInfoResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['query_result_list'])) {
            if (!empty($map['query_result_list'])) {
                $model->queryResultList = [];
                $n                      = 0;
                foreach ($map['query_result_list'] as $item) {
                    $model->queryResultList[$n++] = null !== $item ? QueryResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
