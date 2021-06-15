<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeCasewritebackRequest extends Model
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

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
    /**
     * @var string
     */
    public $clientToken;

    // 自动进件案件基础信息
    /**
     * @var CaseBasicInfo
     */
    public $caseBasicInfo;

    // 发起人对象列表
    /**
     * @var ProposerObject[]
     */
    public $proposerObjects;

    // 答辩人对象列表
    /**
     * @var PleaderObject[]
     */
    public $pleaderObjects;

    // 自动进件证据要素
    /**
     * @var LeaseEvidentialElement
     */
    public $leaseEvidentialElement;

    // 证据清单列表
    /**
     * @var EvidentialCheckList[]
     */
    public $evidentialCheckList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'clientToken'            => 'client_token',
        'caseBasicInfo'          => 'case_basic_info',
        'proposerObjects'        => 'proposer_objects',
        'pleaderObjects'         => 'pleader_objects',
        'leaseEvidentialElement' => 'lease_evidential_element',
        'evidentialCheckList'    => 'evidential_check_list',
    ];

    public function validate()
    {
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('caseBasicInfo', $this->caseBasicInfo, true);
        Model::validateRequired('proposerObjects', $this->proposerObjects, true);
        Model::validateRequired('pleaderObjects', $this->pleaderObjects, true);
        Model::validateRequired('leaseEvidentialElement', $this->leaseEvidentialElement, true);
        Model::validateRequired('evidentialCheckList', $this->evidentialCheckList, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->caseBasicInfo) {
            $res['case_basic_info'] = null !== $this->caseBasicInfo ? $this->caseBasicInfo->toMap() : null;
        }
        if (null !== $this->proposerObjects) {
            $res['proposer_objects'] = [];
            if (null !== $this->proposerObjects && \is_array($this->proposerObjects)) {
                $n = 0;
                foreach ($this->proposerObjects as $item) {
                    $res['proposer_objects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pleaderObjects) {
            $res['pleader_objects'] = [];
            if (null !== $this->pleaderObjects && \is_array($this->pleaderObjects)) {
                $n = 0;
                foreach ($this->pleaderObjects as $item) {
                    $res['pleader_objects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->leaseEvidentialElement) {
            $res['lease_evidential_element'] = null !== $this->leaseEvidentialElement ? $this->leaseEvidentialElement->toMap() : null;
        }
        if (null !== $this->evidentialCheckList) {
            $res['evidential_check_list'] = [];
            if (null !== $this->evidentialCheckList && \is_array($this->evidentialCheckList)) {
                $n = 0;
                foreach ($this->evidentialCheckList as $item) {
                    $res['evidential_check_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeCasewritebackRequest
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['case_basic_info'])) {
            $model->caseBasicInfo = CaseBasicInfo::fromMap($map['case_basic_info']);
        }
        if (isset($map['proposer_objects'])) {
            if (!empty($map['proposer_objects'])) {
                $model->proposerObjects = [];
                $n                      = 0;
                foreach ($map['proposer_objects'] as $item) {
                    $model->proposerObjects[$n++] = null !== $item ? ProposerObject::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pleader_objects'])) {
            if (!empty($map['pleader_objects'])) {
                $model->pleaderObjects = [];
                $n                     = 0;
                foreach ($map['pleader_objects'] as $item) {
                    $model->pleaderObjects[$n++] = null !== $item ? PleaderObject::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['lease_evidential_element'])) {
            $model->leaseEvidentialElement = LeaseEvidentialElement::fromMap($map['lease_evidential_element']);
        }
        if (isset($map['evidential_check_list'])) {
            if (!empty($map['evidential_check_list'])) {
                $model->evidentialCheckList = [];
                $n                          = 0;
                foreach ($map['evidential_check_list'] as $item) {
                    $model->evidentialCheckList[$n++] = null !== $item ? EvidentialCheckList::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
