<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignTaskRequest extends Model
{
    // 签署人信息
    /**
     * @example
     *
     * @var AntSignUserInfoRequest[]
     */
    public $antSignUserInfoRequestList;

    // 待签署文件列表
    /**
     * @example
     *
     * @var AntSignFileRequest[]
     */
    public $antSignFileRequestList;

    // relatedBusiness	是否关联业务
    /**
     * @example true, false 默认：false
     *
     * @var bool
     */
    public $relatedBusiness;

    // 任务描述
    /**
     * @example 任务描述
     *
     * @var string
     */
    public $description;

    // 业务扩展参数
    /**
     * @example 业务扩展参数
     *
     * @var string
     */
    public $extraParam;

    // 子业务流水号（如果只有单任务，可以跟bizNo填相同的值）
    /**
     * @example 子业务流水号
     *
     * @var string
     */
    public $subBizNo;

    // 业务配置参数，用于展示或隐藏签署功能 默认不传：false
    /**
     * @example 默认不传
     *
     * @var string
     */
    public $signConfigParam;
    protected $_name = [
        'antSignUserInfoRequestList' => 'ant_sign_user_info_request_list',
        'antSignFileRequestList'     => 'ant_sign_file_request_list',
        'relatedBusiness'            => 'related_business',
        'description'                => 'description',
        'extraParam'                 => 'extra_param',
        'subBizNo'                   => 'sub_biz_no',
        'signConfigParam'            => 'sign_config_param',
    ];

    public function validate()
    {
        Model::validateRequired('antSignUserInfoRequestList', $this->antSignUserInfoRequestList, true);
        Model::validateRequired('antSignFileRequestList', $this->antSignFileRequestList, true);
        Model::validateRequired('subBizNo', $this->subBizNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antSignUserInfoRequestList) {
            $res['ant_sign_user_info_request_list'] = [];
            if (null !== $this->antSignUserInfoRequestList && \is_array($this->antSignUserInfoRequestList)) {
                $n = 0;
                foreach ($this->antSignUserInfoRequestList as $item) {
                    $res['ant_sign_user_info_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->antSignFileRequestList) {
            $res['ant_sign_file_request_list'] = [];
            if (null !== $this->antSignFileRequestList && \is_array($this->antSignFileRequestList)) {
                $n = 0;
                foreach ($this->antSignFileRequestList as $item) {
                    $res['ant_sign_file_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->relatedBusiness) {
            $res['related_business'] = $this->relatedBusiness;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraParam) {
            $res['extra_param'] = $this->extraParam;
        }
        if (null !== $this->subBizNo) {
            $res['sub_biz_no'] = $this->subBizNo;
        }
        if (null !== $this->signConfigParam) {
            $res['sign_config_param'] = $this->signConfigParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntSignTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_sign_user_info_request_list'])) {
            if (!empty($map['ant_sign_user_info_request_list'])) {
                $model->antSignUserInfoRequestList = [];
                $n                                 = 0;
                foreach ($map['ant_sign_user_info_request_list'] as $item) {
                    $model->antSignUserInfoRequestList[$n++] = null !== $item ? AntSignUserInfoRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ant_sign_file_request_list'])) {
            if (!empty($map['ant_sign_file_request_list'])) {
                $model->antSignFileRequestList = [];
                $n                             = 0;
                foreach ($map['ant_sign_file_request_list'] as $item) {
                    $model->antSignFileRequestList[$n++] = null !== $item ? AntSignFileRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['related_business'])) {
            $model->relatedBusiness = $map['related_business'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extra_param'])) {
            $model->extraParam = $map['extra_param'];
        }
        if (isset($map['sub_biz_no'])) {
            $model->subBizNo = $map['sub_biz_no'];
        }
        if (isset($map['sign_config_param'])) {
            $model->signConfigParam = $map['sign_config_param'];
        }

        return $model;
    }
}
