<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignTaskRequest extends Model
{
    // 子业务流水号
    /**
     * @example DF42323124
     *
     * @var string
     */
    public $subBizNo;

    // 任务描述
    /**
     * @example 关交合同
     *
     * @var string
     */
    public $description;

    // 签署人信息
    /**
     * @example
     *
     * @var CaSignUserInfoRequest[]
     */
    public $signUserInfoRequestList;

    // 待签署文件列表
    /**
     * @example
     *
     * @var CaSignFileRequest[]
     */
    public $signFileRequestList;
    protected $_name = [
        'subBizNo'                => 'sub_biz_no',
        'description'             => 'description',
        'signUserInfoRequestList' => 'sign_user_info_request_list',
        'signFileRequestList'     => 'sign_file_request_list',
    ];

    public function validate()
    {
        Model::validateRequired('subBizNo', $this->subBizNo, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('signUserInfoRequestList', $this->signUserInfoRequestList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subBizNo) {
            $res['sub_biz_no'] = $this->subBizNo;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->signUserInfoRequestList) {
            $res['sign_user_info_request_list'] = [];
            if (null !== $this->signUserInfoRequestList && \is_array($this->signUserInfoRequestList)) {
                $n = 0;
                foreach ($this->signUserInfoRequestList as $item) {
                    $res['sign_user_info_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signFileRequestList) {
            $res['sign_file_request_list'] = [];
            if (null !== $this->signFileRequestList && \is_array($this->signFileRequestList)) {
                $n = 0;
                foreach ($this->signFileRequestList as $item) {
                    $res['sign_file_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_biz_no'])) {
            $model->subBizNo = $map['sub_biz_no'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['sign_user_info_request_list'])) {
            if (!empty($map['sign_user_info_request_list'])) {
                $model->signUserInfoRequestList = [];
                $n                              = 0;
                foreach ($map['sign_user_info_request_list'] as $item) {
                    $model->signUserInfoRequestList[$n++] = null !== $item ? CaSignUserInfoRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_file_request_list'])) {
            if (!empty($map['sign_file_request_list'])) {
                $model->signFileRequestList = [];
                $n                          = 0;
                foreach ($map['sign_file_request_list'] as $item) {
                    $model->signFileRequestList[$n++] = null !== $item ? CaSignFileRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
