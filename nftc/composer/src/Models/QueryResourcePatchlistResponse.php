<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class QueryResourcePatchlistResponse extends Model
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

    // 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
    /**
     * @var string
     */
    public $patchStatus;

    // 全量包下载地址
    /**
     * @var string
     */
    public $url;

    // 资源ID
    /**
     * @var string
     */
    public $resourceId;

    // 全量包版本号
    /**
     * @var int
     */
    public $version;

    // 全量包md5摘要值
    /**
     * @var string
     */
    public $md5;

    // 全量包文件大小
    /**
     * @var int
     */
    public $size;

    // 差量包文件信息列表
    /**
     * @var GeneralResourcePatch[]
     */
    public $patchList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'patchStatus' => 'patch_status',
        'url'         => 'url',
        'resourceId'  => 'resource_id',
        'version'     => 'version',
        'md5'         => 'md5',
        'size'        => 'size',
        'patchList'   => 'patch_list',
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
        if (null !== $this->patchStatus) {
            $res['patch_status'] = $this->patchStatus;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->patchList) {
            $res['patch_list'] = [];
            if (null !== $this->patchList && \is_array($this->patchList)) {
                $n = 0;
                foreach ($this->patchList as $item) {
                    $res['patch_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourcePatchlistResponse
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
        if (isset($map['patch_status'])) {
            $model->patchStatus = $map['patch_status'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['md5'])) {
            $model->md5 = $map['md5'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['patch_list'])) {
            if (!empty($map['patch_list'])) {
                $model->patchList = [];
                $n                = 0;
                foreach ($map['patch_list'] as $item) {
                    $model->patchList[$n++] = null !== $item ? GeneralResourcePatch::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
