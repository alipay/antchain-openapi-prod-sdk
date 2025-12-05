<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ListAuthConfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 连接器空间id
    /**
     * @var string
     */
    public $sourceSpaceId;

    // 客户名称
    /**
     * @var string
     */
    public $targetName;

    // 业务应用名称
    /**
     * @var string
     */
    public $authAppName;

    // 授权内容code列表
    /**
     * @var string[]
     */
    public $authContentCodeList;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'sourceSpaceId'       => 'source_space_id',
        'targetName'          => 'target_name',
        'authAppName'         => 'auth_app_name',
        'authContentCodeList' => 'auth_content_code_list',
        'pageNum'             => 'page_num',
        'pageSize'            => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('sourceSpaceId', $this->sourceSpaceId, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->sourceSpaceId) {
            $res['source_space_id'] = $this->sourceSpaceId;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->authAppName) {
            $res['auth_app_name'] = $this->authAppName;
        }
        if (null !== $this->authContentCodeList) {
            $res['auth_content_code_list'] = $this->authContentCodeList;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAuthConfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['source_space_id'])) {
            $model->sourceSpaceId = $map['source_space_id'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['auth_app_name'])) {
            $model->authAppName = $map['auth_app_name'];
        }
        if (isset($map['auth_content_code_list'])) {
            if (!empty($map['auth_content_code_list'])) {
                $model->authContentCodeList = $map['auth_content_code_list'];
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
