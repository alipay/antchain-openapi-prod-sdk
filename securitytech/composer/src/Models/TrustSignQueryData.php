<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class TrustSignQueryData extends Model
{
    // 请求唯一标识Id
    /**
     * @example 111111111111111
     *
     * @var string
     */
    public $requestId;

    // 订单状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $orderStatus;

    // 签约方案码
    /**
     * @example 011fda32a0046d0e8a8be6b94b367fb3
     *
     * @var string
     */
    public $solutionCode;

    // 创建时间
    /**
     * @example 2024-03-20
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2024-03-20
     *
     * @var string
     */
    public $gmtModified;

    // 签约文件列表
    /**
     * @example
     *
     * @var string[]
     */
    public $fileList;
    protected $_name = [
        'requestId'    => 'request_id',
        'orderStatus'  => 'order_status',
        'solutionCode' => 'solution_code',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'fileList'     => 'file_list',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('solutionCode', $this->solutionCode, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('fileList', $this->fileList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->solutionCode) {
            $res['solution_code'] = $this->solutionCode;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->fileList) {
            $res['file_list'] = $this->fileList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrustSignQueryData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['solution_code'])) {
            $model->solutionCode = $map['solution_code'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['file_list'])) {
            if (!empty($map['file_list'])) {
                $model->fileList = $map['file_list'];
            }
        }

        return $model;
    }
}
